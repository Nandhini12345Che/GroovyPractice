<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
    </head>
    <body>
        <div id="create-Teacher" class="content scaffold-create" role="main">
            <g:form resource="${this.Teacher}" method="POST">
                <fieldset class="form">
                    <f:all bean="Teacher"/>
                </fieldset>
                <fieldset class="buttons">
                    <g:submitButton name="create" class="save" value="Create" />
                </fieldset>
            </g:form>
        </div>
    </body>
</html>