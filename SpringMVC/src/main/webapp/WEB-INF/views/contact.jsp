<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
      <div class="container mt-5">
         <h3 class= "text-center">${Header}</h3>
         <p>${Desc}</p>
         <form action= "processform" method="post">
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">Email address</label>
                <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter here" name="email">
                <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                </div>
              <div class="mb-3">
                    <label for="userName" class="form-label">Username</label>
                    <input type="text" class="form-control" id="userName" aria-describedby="emailHelp" placeholder="Enter here" name="name">
              </div>

              <div class="mb-3">
                    <label for="password" class="form-label">password</label>
                    <input type="text" class="form-control" id="password" aria-describedby="emailHelp" placeholder="Enter here" name="password">
               </div>
               <div class = "container text-center">
                  <button type="submit" class = "btn btn-success">Sign Up</button>
                </div>
         </form>

       </div>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzXmM7KCkRr/rE9/Qpg6aAZGJwFDNv/GPgFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1Qtv3Rn7W3mgPxhU9K/ScQsAP7HUiBx39j7fakFPskvXusfvabob4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>
