

console.log("This script works!")

// .then(json => json.array.forEach(element => {
//     let tr = document.createElement("tr")
//     tr.innerHTML = `${element}`
//     document.querySelzzector(tbody)
//     tbody.appendChild(tr);
// }))

fetch('http://localhost:8080/donuts')
    .then(response => response.json())
    .then(json => {
        for (el in json) {
            console.log(json[el])
            // console.log(json[el].name)
            let tbody = document.querySelector("tbody")
            let tr = document.createElement("tr")
            tr.className = `row-${json[el].id}`
            tr.innerHTML = `<td>${json[el].id}</td>
            <td>${json[el].name}</td>
            <td>${json[el].frosted ? 'frosted' : 'not frosted'}</td>
            <td>${json[el].donutType}</td>
            <td><i class="fa fa-trash" style="cursor:pointer" onclick="deleteItem(${json[el].id})"></i></td>
            <td><i class="fas fa-pencil-alt" onclick="updateItem()"></i></td>`
            tbody.appendChild(tr)
        }
    })


    const deleteItem = (id) => {
        document.querySelector(`.row-${id}`).remove()
       fetch(`http://localhost:8080/donut/${id}`, {
           method: 'DELETE',
       })
       .then(response => response.json)
       .then(json => console.log(json))
    }

    const updateItem = () => {
        console.log("update works")
    }

