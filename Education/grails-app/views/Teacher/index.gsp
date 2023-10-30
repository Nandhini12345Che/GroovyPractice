<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
    </head>
    <body>
        <div class="nav" role="navigation">
            <ul>
                <li><g:link class="create" action="create">Create</g:link></li>
            </ul>
        </div>
        <div id="list-Teacher" class="content scaffold-list" role="main">
            <f:table collection="${TeacherList}" 
                properties="['firstName', 'lastName']" />
        </div>
    </body>
</html>