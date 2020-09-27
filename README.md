# StringValidatorCompiladores

O String Validator funciona apenas com a seguinte linguagem <{[()]}>.

Para utilizar basta Buildar e dar play no projeto e digitar o Input no console.

O seguinte exemplo mostra como funciona as verificações:

Input processado: [](){}
            == OK == Válido
            Input processada: [)]{}
            == Não == Inválido
            Input processada: [(]){}<>
            == Não == Inválido
            Input processada: (((((([]))))))
            == OK == Válido
            Input processada: {{[[()]()]}}
            == OK == Válido
            Input processada: {[[([)]]]}
            == Não == Inválido
            Input processada: <{(())}>
            == OK == Válido
            Input processada: {<[]()[[]]<>>}
            == OK == Válido
            (== quit || CTRL + C == Para sair)
            Processe mais algum input no alfabeto da linguagem <{[()]}> :
