import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { EmployeeModel } from './admin-dashboard.model';
import { ApiService } from '../shared/api.service';


@Component({
  selector: 'app-admin-dashboard',
  templateUrl: './admin-dashboard.component.html',
  styleUrls: ['./admin-dashboard.component.css']
})
export class AdminDashboardComponent implements OnInit {
formValue !: FormGroup;
employeeModelObj : EmployeeModel = new EmployeeModel();
employeeData !: any;
showAdd !: boolean;
showUpdate  !: boolean;
  constructor(private formbuilder: FormBuilder,
  private api : ApiService) { }

  ngOnInit(): void {
    this.formValue = this.formbuilder.group({
      name:[''],
      email:[''], 
      designation:[''],
      salary:['']
    })
    this.getAllEmployee();
  }

  postEmployeeDetails(){
    this.employeeModelObj.name= this.formValue.value.name;
    this.employeeModelObj.email= this.formValue.value.email;
    this.employeeModelObj.designation= this.formValue.value.designation;
    this.employeeModelObj.salary= this.formValue.value.salary;

    this.api.postEmployee(this.employeeModelObj)
    .subscribe((res)=>{
      console.log(res);
      alert("successfully added new employee!!!");
      this.getAllEmployee();
    },
    err=>{
      alert("failure")
    })
  }

  getAllEmployee(){
    this.api.getEmployee()
    .subscribe(res=>{
      //console.log(res);
      this.employeeData=res;
    })
  }

  deleteEmployee(c : any){
    this.api.deleteEmployee(c.id)
    .subscribe(res=>{
      alert("Employee details deleted!!!");
      this.getAllEmployee();
    })
}

onEdit(c : any){
  this.employeeModelObj.id=c.id;
  this.formValue.controls['name'].setValue(c.name);
  this.formValue.controls['email'].setValue(c.email);
  this.formValue.controls['designation'].setValue(c.designation);
  this.formValue.controls['salary'].setValue(c.salary);
  this.showUpdate=true;
  this.showAdd=false;
}
  
updateEmployee(){
  this.employeeModelObj.name= this.formValue.value.name;
    this.employeeModelObj.email= this.formValue.value.email;
    this.employeeModelObj.designation= this.formValue.value.designation;
    this.employeeModelObj.salary= this.formValue.value.salary;

    this.api.updateEmployee(this.employeeModelObj, this.employeeModelObj.id)
    .subscribe(res=>{
      alert("successfully updated");
      this.getAllEmployee();
    })
}

clickAddEmployee(){
  this.formValue.reset();
  this.showAdd=true;
  this.showUpdate=false;
}


}

