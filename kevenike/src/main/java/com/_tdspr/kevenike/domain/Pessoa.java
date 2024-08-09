package com._tdspr.kevenike.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

    private String nome;
    private String sobrenome;
    private String documento;
}
