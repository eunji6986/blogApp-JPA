<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>joinForm</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container">
  <h2>로그인</h2>
  <form>
    <div class="form-group">
      <label for="id">아이디:</label>
      <input type="id" class="form-control" id="username" placeholder="아이디를 입력해주세요" name="id">
    </div>
     <div class="form-group">
      <label for="pwd">비밀번호:</label>
      <input type="password" class="form-control" id="pwd" placeholder="비밀번호를 입력해주세요" name="pwd">
    </div>
  </form>
    <button id="btn-login" class="btn btn-primary">로그인</button>
</div>

<script src="/blog/js/user.js"></script>

