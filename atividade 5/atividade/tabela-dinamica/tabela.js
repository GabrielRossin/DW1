
var carros = [
    {"fabricante": "VW", "modelo": "Gol", "ano": 1997},
    {"fabricante": "VW", "modelo": "Santana", "ano": 2000},
    {"fabricante": "Chevrolet", "modelo": "Corsa", "ano": 1994},
    {"fabricante": "Fiat", "modelo": "Fiat 147", "ano": 1979},
    {"fabricante": "Fiat", "modelo": "Uno", "ano": 2003}
];


function preencherTabela() {
        /* implemente o corpo desta função */
        var i;
        var x

        for (i = 0 ; i < carros.length; i++) 
        {
			var row = document.createElement('tr');

		  	 x = row.insertCell(0);
		  	 x.innerHTML = carros[i].fabricante;

		  	 x= row.insertCell(1)
		  	 x.innerHTML = carros[i].modelo;

		  	 x = row.insertCell(2)
		  	 x.innerHTML = carros[i].ano;

		  	document.querySelector("tbody").appendChild(row);	
		}
}
