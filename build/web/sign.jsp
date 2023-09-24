<%-- 
    Document   : sign
    Created on : Jul 16, 2023, 11:42:12 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link rel="stylesheet" href="css/style.css">
        <title>Bootstrap 4 Login/Register Form</title>
    </head>
    <body>
        <form action="signup" method="post" class="form-signup">
            <div class="social-login">
                <button class="btn facebook-btn social-btn" type="button"><span><i class="fab fa-facebook-f"></i> Sign up with Facebook</span> </button>
            </div>
            <div class="social-login">
                <button class="btn google-btn social-btn" type="button"><span><i class="fab fa-google-plus-g"></i> Sign up with Google+</span> </button>
            </div>

            <p style="text-align:center">OR</p>

            <input name ="user" type="text" id="user-name" class="form-control" placeholder="Full name" required="" autofocus="">
            <! --input type="email" id="user-email" class="form-control" placeholder="Email address" required autofocus=""-->
            <input name ="pass" type="password" id="user-pass" class="form-control" placeholder="Password" required autofocus="">
            <input name ="repass" type="password" id="user-repeatpass" class="form-control" placeholder="Repeat Password" required autofocus="">

            <button class="btn btn-primary btn-block" type="submit"><i class="fas fa-user-plus"></i> Sign Up</button>
            
        </form>
        <br>
        <p style="text-align:center">
            <a href="http://bit.ly/2RjWFMfunction toggleResetPswd(e){
               e.preventDefault();
               $('#logreg-forms .form-signin').toggle() // display:block or none
               $('#logreg-forms .form-reset').toggle() // display:block or none
               }

               function toggleSignUp(e){
               e.preventDefault();
               $('#logreg-forms .form-signin').toggle(); // display:block or none
               $('#logreg-forms .form-signup').toggle(); // display:block or none
               }

               $(()=>{
               // Login Register Form
               $('#logreg-forms #forgot_pswd').click(toggleResetPswd);
               $('#logreg-forms #cancel_reset').click(toggleResetPswd);
               $('#logreg-forms #btn-signup').click(toggleSignUp);
               $('#logreg-forms #cancel_signup').click(toggleSignUp);
               })g" target="_blank" style="color:red">${sign}</a>
        </p>
    </body>
</html>
