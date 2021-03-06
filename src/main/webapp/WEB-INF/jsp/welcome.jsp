<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Coviam</title>
</head>
<body>
    <style type="text/css">
        .user-container{ width: 50%;}
        .username-container{ margin: 10px;}
        .service-name-container{margin: 10px;}
        .fullNameLable{ margin-right: 46px;}
        button{    padding: 8px;
                            margin-left: -5px;
                            background-color: #8aaeff;
                            color: white;
                            border: none;
                            cursor: pointer;
                                }

                            input{
                                    line-height: 21px;
                                    padding: 2px;
                                    width: 50%;
                            }
                            .findAll{
                                display: none;
                            }
                            .findAllLabel{margin-right: 83px;}
                            .findByIdLabel{margin-right: 77px;}
                            .findAllBtn{margin-left: 1px;}
    </style>
    <div class="user-container">
        <div class="username-container">
            <form action="/candidateTesting/findbyFullname" method="get">
                <label class="fullNameLable" for="FindByName">FindByName</label>
                <input type="text" name="fullname" id="FindByName" />
                <button type="submit" class="fullnameSubmit">FindByName</button>
            </form>
        </div>
        <div class="service-name-container">
            <form action="/candidateTesting/findbyService" method="get">
                <label for="FindByMicroservice">FindByMicroservice</label>
                <input type="text" name="service" id="FindByMicroservice" />
                <button type="submit">FindByMicroservice</button>
            </form>
        </div>

        <div class="service-name-container">
             <form action="/candidateTesting/findById" method="get">
                 <label class="findByIdLabel" for="FindByName">FindById</label>
                 <input type="text" name="id" id="FindById" />
                 <button type="submit" class="findById">FindById</button>
             </form>
        </div>

<div class="service-name-container">
            <form action="/candidateTesting/findAll" method="get">
                <label class="findAllLabel">FindAll</label>
                <button type="submit" class="findAllBtn">FindAll</button>
            </form>
        </div>

    </div>
    <script type=""
</body>
</html>