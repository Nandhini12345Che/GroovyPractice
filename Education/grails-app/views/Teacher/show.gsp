<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
    </head>
    <body>
        <div class="nav" role="navigation">
            <ul>
                <li><g:link class="list" action="index">Teachers list</g:link></li>
            </ul>
        </div>
        <div id="show-Teacher" class="content scaffold-show" role="main">
            <f:display bean="Teacher" />
            <g:form resource="${this.Teacher}" method="DELETE">
                <fieldset class="buttons">
                    <input class="delete" type="submit" value="delete" />
                </fieldset>
            </g:form>
        </div>
    </body>
</html>