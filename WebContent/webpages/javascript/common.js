var json1 = "{\"attribute\":\"old\"}";
function renderData() {
        var obj = { 'players': [
            { 'fname': 'joe', 'lname': 'smith', 'number': '34' },
            { 'fname': 'jim', 'lname': 'jones', 'number': '12' },
            { 'fname': 'jack', 'lname': 'Hoff', 'number': '84' } 
            ] };

        var cols = GetHeaders(obj); 

        $('#Output').html(CreateTable(obj, cols));
    }


    function CreateTable(obj, cols) {
        var table = $('<table></table>');
        var th = $('<tr></tr>');
        for (var i = 0; i < cols.length; i++) {
            th.append('<th>' + cols[i] + '</th>');
        }
        table.append(th);

        for (var j = 0; j < obj.players.length; j++) {
            var player = obj.players[j];
            var tr = $('<tr></tr>');
            for (var k = 0; k < cols.length; k++) {
                var columnName = cols[k];
                tr.append('<td>' + player[columnName] + '</td>');
            }
            table.append(tr);
        }
        return table;
    }



    function GetHeaders(obj) {
        var cols = new Array();
        var p = obj.players[0];
        for (var key in p) {
            //alert(' name=' + key + ' value=' + p[key]);
            cols.push(key);
        }
        return cols;
    }
    
function initBuild(){
		alert("init build called from common.js : ");
		document.initbuild.action = document.initbuild.submit();
}    
    /*
     * 
     * arguments 
     * 	tblid : id of the table where new rows and cells will be inserted
     * 	json  : the data (row and column) in json format
     */
function insertRow(tblid,json){
/*
 * This function creates dynamic table from json string , an example of json string is as below. Now going to take a ride with my brother code u later.
 */	
	//var json2= "{\"class\":[{\"city\":\"ahmd\",\"tsl\":\"svkd\",\"tsl2\":\"svkd2\"}]}";
	var obj = JSON.parse(json);
	var table = tblid;
	
	for (var key in obj){
		for(i=0;i<obj[key].length;i++){
			var row = table.insertRow(i+1);
			var j = 0;
			for(var col in obj[key][i]){
				var value = obj[key][i][col];
				var col = row.insertCell(j++);
				col.innerHTML=value;
			}//FOR 1.1.1
		}//FOR 1.1
	}//FOR 1
}//INSERTROW FUNCTION END
ajaxGetBranchList();