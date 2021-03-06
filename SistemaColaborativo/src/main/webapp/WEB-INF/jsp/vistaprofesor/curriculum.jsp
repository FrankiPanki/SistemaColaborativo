<%-- 
    Document   : curriculum
    Created on : 3/10/2018, 03:04:12 PM
    Author     : Moctezuma19
--%>
<jsp:include page='headerProfesores.jsp'>
    <jsp:param name="title" value="Tu curriculum"/>
</jsp:include>
<div align='center' style="padding-top:50px;">
    <div class="mdl-cell mdl-cell--3-col mdl-cell--4-col-tablet mdl-cell--4-col-phone mdl-card mdl-shadow--3dp center-block" style="width:500px">
        <div class="mdl-card__title" style="background-color:#66b04f;" >
            <!--h4 class="mdl-card__title-text" style='color:white;'>Informaci�n Acad�mica y Laboral</h4-->
        </div>
        <div class="mdl-card__supporting-text">
            <span class="mdl-typography--font-light mdl-typography--subhead">Platicanos m�s sobre tu experiencia.</span>
        </div>
        <form method="post" style="width:500px" enctype="multipart/form-data" action="${pageContext.request.contextPath}/profesor/guardacv">
            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                <select class="mdl-textfield__input" id="lugar" name="lugar">
                    <option value="Aguascalientes">Aguascalientes</option>
                    <option value="Baja California">Baja California</option>
                    <option value="Baja California Sur">Baja California Sur</option>
                    <option value="Campeche">Campeche</option>
                    <option value="Coahuila de Zaragoza">Coahuila de Zaragoza</option>
                    <option value="Colima">Colima</option>
                    <option value="Chiapas">Chiapas</option>
                    <option value="Chihuahua">Chihuahua</option>
                    <option value="Distrito Federal">Distrito Federal</option>
                    <option value="Durango">Durango</option>
                    <option value="Guanajuato">Guanajuato</option>
                    <option value="Guerrero">Guerrero</option>
                    <option value="Hidalgo">Hidalgo</option>
                    <option value="Jalisco">Jalisco</option>
                    <option value="M�xico">M�xico</option>
                    <option value="Michoac�n de Ocampo">Michoac�n de Ocampo</option>
                    <option value="Morelos">Morelos</option>
                    <option value="Nayarit">Nayarit</option>
                    <option value="Nuevo Le�n">Nuevo Le�n</option>
                    <option value="Oaxaca">Oaxaca</option>
                    <option value="Puebla">Puebla</option>
                    <option value="Quer�taro">Quer�taro</option>
                    <option value="Quintana Roo">Quintana Roo</option>
                    <option value="San Luis Potos�">San Luis Potos�</option>
                    <option value="Sinaloa">Sinaloa</option>
                    <option value="Sonora">Sonora</option>
                    <option value="Tabasco">Tabasco</option>
                    <option value="Tamaulipas">Tamaulipas</option>
                    <option value="Tlaxcala">Tlaxcala</option>
                    <option value="Veracruz de Ignacio de la Llave">Veracruz de Ignacio de la Llave</option>
                    <option value="Yucat�n">Yucat�n</option>
                    <option value="Zacatecas">Zacatecas</option>
                </select>
                <label class="mdl-textfield__label" for="lugar">Estado de origen</label>
            </div>
            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                <i><label class="mdl-card__title">Formaci�n Acad�mica</label></i>
            </div>
            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                <input class="mdl-textfield__input" type="text" id = "estudios" name = "estudios" required>
                <label class="mdl-textfield__label" for="estudios">Estudios</label>
            </div>
            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                <input class="mdl-textfield__input" type="text" id = "universidad" name = "universidad" required>
                <label class="mdl-textfield__label" for="universidad">Universidad</label>
            </div>
            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                <input class="mdl-textfield__input" type="number" id="costo" name="costo" required>
                <label class="mdl-textfield__label" for="costo">Costo por hora (MXN)</label>
            </div>
            <div class="mdl-textfield mdl-js-textfield">
                <input class="mdl-textfield__input" id="file" type="text" name="identificacion" style="left:0;" placeholder="Tu identificaci�n" required readonly>
                <Label class="input-custom-file mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--colored" style="right:0;background-color:#66b04f;">
                    Subir
                    <input type="file" id="boton" name="boton" accept="image/jpeg, image/png" style="display:none;">
                </label>
            </div>
            <div class="mdl-card__actions" style="padding-bottom:30px;">
                <button class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent" style="background-color:#66b04f;width:70%;">
                    Enviar
                </button>
            </div>
        </form>            
    </div>
</div>
<%@include file='footer.jsp'%>
