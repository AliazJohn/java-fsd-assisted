import { Component, OnInit } from '@angular/core';
import { FormGroup,FormControl } from '@angular/forms';
import { Login } from '../login';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  msg:string=""
  loginRef = new FormGroup({
    email:new FormControl(),
    pass: new FormControl()
  })

  loginDetails:Array<Login>=[]
  constructor() { }

  ngOnInit(): void {
  }

  createAccount(){
    let login = this.loginRef.value;
    let l = {email:login.email,pass:login.pass}   //literal style
    let res = this.loginDetails.find(obj=>obj.email==l.email)
    if(res==undefined){
    this.loginDetails.push(l)
    sessionStorage.setItem("loginInfo",JSON.stringify(this.loginDetails))
    this.msg = "Account Created Successfully"
    }
    else{
      this.msg = "EmailID must be Unique"
    }
    this.loginRef.reset();
  }

}
