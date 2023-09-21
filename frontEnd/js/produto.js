const form = document.getElementById("formulario");

form.addEventListener("submit", event =>{
    event.preventDefault();

    const formData = new FormData(form);
    const data = Object.fromEntries(formData);

    fetch("http://localhost:8081/api/produtos", {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
    }).then(res => res.json()).then(data => console.log(data)).catch(error => console.log(error));
});

function mensagem(){
    alert("produto cadastrado com sucesso!")
    window.location.reload(true);
}


fetch("http://localhost:8081/api/produtos").then((data)=>{
    return data.json();
  }).then((findAll) =>{
      let data1 = "";
      findAll.map((values) =>{
          data1 += `
          <tbody>
              <tr>
                  <th scope="row">${values.id} </td>
                  <td>${values.nome}</td> 
                  <td>${values.quantidade}</td> 
                  <td>${values.preco} </td>
                  <td>${values.codigo}</td> 
              </tr>
          </tbody>
          `
      })
      document.getElementById("produtoDados").innerHTML = data1;
      console.log(findAll);
  })



