package com.estudo.cursoudemy.domains;

import com.estudo.cursoudemy.domains.enumeration.EstadoPagamento;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.persistence.Entity;
import java.util.Date;
@Entity
@JsonTypeName(value = "pagamentoComBoleto")
public class PagamentoComBoleto extends Pagamento{
    private static final long serialVersionUID = 1L;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataVencimento;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date datapagamento;

    public PagamentoComBoleto(){
    }

    public PagamentoComBoleto(Date dataVencimento, Date datapagamento) {
        this.dataVencimento = dataVencimento;
        this.datapagamento = datapagamento;
    }

    public PagamentoComBoleto(Integer id, EstadoPagamento estadoPagamento, Pedido pedido, Date dataVencimento, Date datapagamento) {
        super(id, estadoPagamento, pedido);
        this.dataVencimento = dataVencimento;
        this.datapagamento = datapagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDatapagamento() {
        return datapagamento;
    }

    public void setDatapagamento(Date datapagamento) {
        this.datapagamento = datapagamento;
    }
}
