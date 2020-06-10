package com.andressamachado.dao;
import com.andressamachado.model.TravelPackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PackageDAO {

        public List<TravelPackage> list() {
            List<TravelPackage> packages = new ArrayList<>(Arrays.asList(
                    new TravelPackage("São Paulo", "sao_paulo_sp", 2, new BigDecimal(243.99)),
                    new TravelPackage("Belo Horizonte", "belo_horizonte_mg", 3, new BigDecimal(421.50)),
                    new TravelPackage("Recife", "recife_pe", 4, new BigDecimal(754.20)),
                    new TravelPackage("Rio de Janeiro", "rio_de_janeiro_rj", 6, new BigDecimal(532.55)),
                    new TravelPackage("Salvador", "salvador_ba", 5, new BigDecimal(899.99)),
                    new TravelPackage("Foz do Iguaçu", "foz_do_iguacu_pr", 1, new BigDecimal(289.90))));
            return packages;
        }

}