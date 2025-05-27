async function carregarClientes() {
    try {
    const response = await fetch("http://localhost:8080/api/clientes");
    const clientes = await response.json();

    const lista = document.getElementById("lista-clientes");
    lista.innerHTML = "";

    clientes.forEach(cliente => {
        const item = document.createElement("li");
        item.textContent = `${cliente.nome} - ${cliente.email} - ${cliente.telefone}`;
        lista.appendChild(item);
    });
    } catch (error) {
    alert("Erro ao carregar clientes.");
    }
}

window.onload = carregarClientes;

document.getElementById("cliente-form").addEventListener("submit", async function(event) {
    event.preventDefault();

    const clienteDTO = {
    nome: document.getElementById("nome").value,
    email: document.getElementById("email").value,
    telefone: document.getElementById("telefone").value,
    endereco: document.getElementById("endereco").value
    };

    try {
    const response = await fetch("http://localhost:8080/api/clientes", {
        method: "POST",
        headers: {
        "Content-Type": "application/json"
        },
        body: JSON.stringify(clienteDTO)
    });

    if (response.ok) {
        document.getElementById("mensagem").innerText = "Cliente cadastrado com sucesso!";
        document.getElementById("cliente-form").reset();
        carregarClientes(); // recarrega lista
    } else {
        const erro = await response.text();
        document.getElementById("mensagem").innerText = "Erro: " + erro;
        document.getElementById("mensagem").style.color = "red";
    }

    } catch (error) {
    document.getElementById("mensagem").innerText = "Erro ao conectar com o servidor.";
    document.getElementById("mensagem").style.color = "red";
    }
});