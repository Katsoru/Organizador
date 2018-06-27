package br.com.Gabriel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;

//import static com.sun.tools.doclint.Entity.or;

public class Organizar {

//	Collection<Arquivos> colec = new ArrayList<>();

    Integer Organizando(File raiz) throws IOException {

//        this.raiz = raiz;

//
        String resultado;
        File imagens = new File(raiz, "Imagens");
        File musicas = new File(raiz, "Musicas");
        File pdf = new File(raiz, "PDF");
        File executaveis = new File(raiz, "Executaveis");
        File videos = new File(raiz, "Videos");
        File compact = new File(raiz, "Compactados");
        File word = new File(raiz, "Word");
        File powerpoint = new File(raiz, "Powerpoint");
        File excel = new File(raiz, "Excel");
        File outros = new File(raiz, "Outros");
        File outlook = new File(raiz, "Outlook");
        File iso = new File(raiz, "ISO");
        File ms = new File(raiz, "Microsoft");
        File texto = new File(raiz, "Texto");
        Integer erro = 0;
        Collection<String> nImagem = new ArrayList();
        Collection<String> nMusica = new ArrayList();
        Collection<String> nPDF = new ArrayList();
        Collection<String> nExec = new ArrayList();
        Collection<String> nVideos = new ArrayList();
        Collection<String> nCompac = new ArrayList();
        Collection<String> nWord = new ArrayList();
        Collection<String> nPowerpoint = new ArrayList();
        Collection<String> nExcel = new ArrayList();
        Collection<String> nOutros = new ArrayList();
        Collection<String> nOutlook = new ArrayList();
        Collection<String> nISO = new ArrayList();
        Collection<String> nMS = new ArrayList();
        Collection<String> nTexto = new ArrayList();




        // Lista todos os arquivos que está na pasta raiz

        File[] listaArquivos = raiz.listFiles();

        // Faz a separação dos arquivos

        for (File arquivo : listaArquivos) {
            resultado = null;

            // Imagens

            if (arquivo.getName().endsWith(".jpg") || arquivo.getName().endsWith(".JPG")
                    || arquivo.getName().endsWith(".jpeg") || arquivo.getName().endsWith(".JPEG")
                    || arquivo.getName().endsWith(".gif") || arquivo.getName().endsWith(".GIF")
                    || arquivo.getName().endsWith(".png") || arquivo.getName().endsWith(".PNG")
                    || arquivo.getName().endsWith(".bitmap") || arquivo.getName().endsWith(".BITMAP")
                    || arquivo.getName().endsWith(".tiff") || arquivo.getName().endsWith(".TIFF")) {
                imagens.mkdir();

                File destino = new File(imagens, arquivo.getName());

                System.out.println(resultado);

                File[] listaDestino = imagens.listFiles();
                for (File arquivoAtual : listaDestino) {
                    arquivo.renameTo(destino);
                    if (arquivoAtual.getName().equals(arquivo.getName())){
                        resultado = (arquivo.getName() + " não pôde ser transferido para " + imagens.getPath() + " pois já havia um arquivo com o mesmo nome");
                        erro = 1;
                        break;
                    }else{
                        resultado = (arquivo.getName() + " transferido para " + imagens.getPath());
                    }
                }
                nImagem.add(resultado);
            }

            // Musicas

            else if (arquivo.getName().endsWith(".mp3") || arquivo.getName().endsWith(".MP3")
                    || arquivo.getName().endsWith(".wma") || arquivo.getName().endsWith(".WMA")
                    || arquivo.getName().endsWith(".wav") || arquivo.getName().endsWith(".WAV")) {
                musicas.mkdir();
                File destino = new File(musicas, arquivo.getName());

                File[] listaDestino = musicas.listFiles();
                arquivo.renameTo(destino);
                for (File arquivoAtual : listaDestino) {
                    if (arquivoAtual.getName().equals(arquivo.getName())){
                        resultado = (arquivo.getName() + " não pôde ser transferido para " + musicas.getPath() + " pois já havia um arquivo com o mesmo nome");
                        erro = 1;
                        break;
                    }else{
                        resultado = (arquivo.getName() + " transferido para " + musicas.getPath());
                    }
                }
                nMusica.add(resultado);
            }

            // Pdf

            else if (arquivo.getName().endsWith(".pdf") || arquivo.getName().endsWith(".PDF")) {
                pdf.mkdir();
                File destino = new File(pdf, arquivo.getName());
                File[] listaDestino = pdf.listFiles();
                arquivo.renameTo(destino);
                for (File arquivoAtual : listaDestino) {
                    if (arquivoAtual.getName().equals(arquivo.getName())){
                        resultado = (arquivo.getName() + " não pôde ser transferido para " + pdf.getPath() + " pois já havia um arquivo com o mesmo nome");
                        erro = 1;
                        break;
                    }else{
                        resultado = (arquivo.getName() + " transferido para " + pdf.getPath());
                    }
                }
                nPDF.add(resultado);
            }

            // Executaveis/instaladores

            else if (arquivo.getName().endsWith(".exe") || arquivo.getName().endsWith(".EXE")
                    || arquivo.getName().endsWith(".msi") || arquivo.getName().endsWith(".MSI")) {
                executaveis.mkdir();
                File destino = new File(executaveis, arquivo.getName());
                File[] listaDestino = executaveis.listFiles();
                arquivo.renameTo(destino);
                for (File arquivoAtual : listaDestino) {
                    if (arquivoAtual.getName().equals(arquivo.getName())){
                        resultado = (arquivo.getName() + " não pôde ser transferido para " + executaveis.getPath() + " pois já havia um arquivo com o mesmo nome");
                        erro = 1;
                        break;
                    }else{
                        resultado = (arquivo.getName() + " transferido para " + executaveis.getPath());
                    }
                }
                nExec.add(resultado);
            }

            // Videos

            else if (arquivo.getName().endsWith(".avi") || arquivo.getName().endsWith(".AVI")
                    || arquivo.getName().endsWith(".mpeg") || arquivo.getName().endsWith(".MPEG")
                    || arquivo.getName().endsWith(".mov") || arquivo.getName().endsWith(".MOV")
                    || arquivo.getName().endsWith(".rmvb") || arquivo.getName().endsWith(".RMVB")
                    || arquivo.getName().endsWith(".mkv") || arquivo.getName().endsWith(".MKV")
                    || arquivo.getName().endsWith(".mp4") || arquivo.getName().endsWith(".MP4")
                    || arquivo.getName().endsWith(".wmv") || arquivo.getName().endsWith(".WMV")) {
                videos.mkdir();
                File destino = new File(videos, arquivo.getName());
                File[] listaDestino = videos.listFiles();
                arquivo.renameTo(destino);
                for (File arquivoAtual : listaDestino) {
                    if (arquivoAtual.getName().equals(arquivo.getName())){
                        resultado = (arquivo.getName() + " não pôde ser transferido para " + videos.getPath() + " pois já havia um arquivo com o mesmo nome");
                        erro = 1;
                        break;
                    }else{
                        resultado = (arquivo.getName() + " transferido para " + videos.getPath());
                    }
                }
                nVideos.add(resultado);
            }

            // Compactados

            else if (arquivo.getName().endsWith(".zip") || arquivo.getName().endsWith(".ZIP")
                    || arquivo.getName().endsWith(".rar") || arquivo.getName().endsWith(".RAR")
                    || arquivo.getName().endsWith(".7z") || arquivo.getName().endsWith(".7Z")) {
                compact.mkdir();
                File destino = new File(compact, arquivo.getName());
                File[] listaDestino = compact.listFiles();
                arquivo.renameTo(destino);
                for (File arquivoAtual : listaDestino) {
                    if (arquivoAtual.getName().equals(arquivo.getName())){
                        resultado = (arquivo.getName() + " não pôde ser transferido para " + compact.getPath() + " pois já havia um arquivo com o mesmo nome");
                        erro = 1;
                        break;
                    }else{
                        resultado = (arquivo.getName() + " transferido para " + compact.getPath());
                    }
                }
                nCompac.add(resultado);
            }

            // Word

            else if (arquivo.getName().endsWith(".doc") || arquivo.getName().endsWith(".DOC")
                    || arquivo.getName().endsWith(".docx") || arquivo.getName().endsWith(".DOCX")) {
                word.mkdir();
                File destino = new File(word, arquivo.getName());
                File[] listaDestino = word.listFiles();
                arquivo.renameTo(destino);
                for (File arquivoAtual : listaDestino) {
                    if (arquivoAtual.getName().equals(arquivo.getName())){
                        resultado = (arquivo.getName() + " não pôde ser transferido para " + word.getPath() + " pois já havia um arquivo com o mesmo nome");
                        erro = 1;
                        break;
                    }else{
                        resultado = (arquivo.getName() + " transferido para " + word.getPath());
                    }
                }
                nWord.add(resultado);
            }

            // Powerpoint

            else if (arquivo.getName().endsWith(".ppt") || arquivo.getName().endsWith(".PPT")
                    || arquivo.getName().endsWith(".pptx") || arquivo.getName().endsWith(".PPTX")) {
                powerpoint.mkdir();
                File destino = new File(powerpoint, arquivo.getName());
                File[] listaDestino = powerpoint.listFiles();
                arquivo.renameTo(destino);
                for (File arquivoAtual : listaDestino) {
                    if (arquivoAtual.getName().equals(arquivo.getName())){
                        resultado = (arquivo.getName() + " não pôde ser transferido para " + powerpoint.getPath() + " pois já havia um arquivo com o mesmo nome");
                        erro = 1;
                        break;
                    }else{
                        resultado = (arquivo.getName() + " transferido para " + powerpoint.getPath());
                    }
                }
                nPowerpoint.add(resultado);
            }

            // Excel

            else if (arquivo.getName().endsWith(".xls") || arquivo.getName().endsWith(".XLS")
                    || arquivo.getName().endsWith(".xlsx") || arquivo.getName().endsWith(".XLSX")
                    || arquivo.getName().endsWith(".csv") || arquivo.getName().endsWith(".CSV")
                    || arquivo.getName().endsWith(".xlsm") || arquivo.getName().endsWith(".XLSM")
                    || arquivo.getName().endsWith(".xlsb") || arquivo.getName().endsWith(".XLSB")) {
                excel.mkdir();
                File destino = new File(excel, arquivo.getName());
                File[] listaDestino = excel.listFiles();
                arquivo.renameTo(destino);
                for (File arquivoAtual : listaDestino) {
                    if (arquivoAtual.getName().equals(arquivo.getName())){
                        resultado = (arquivo.getName() + " não pôde ser transferido para " + excel.getPath() + " pois já havia um arquivo com o mesmo nome");
                        erro = 1;
                        break;
                    }else{
                        resultado = (arquivo.getName() + " transferido para " + excel.getPath());
                        continue;
                    }
                }

                nExcel.add(resultado);
            }

            // Outlook

            else if (arquivo.getName().endsWith(".msg") || arquivo.getName().endsWith(".MSG")
                    || arquivo.getName().endsWith(".pst") || arquivo.getName().endsWith(".PST")) {
                outlook.mkdir();
                File destino = new File(outlook, arquivo.getName());
                File[] listaDestino = outlook.listFiles();
                arquivo.renameTo(destino);
                for (File arquivoAtual : listaDestino) {
                    if (arquivoAtual.getName().equals(arquivo.getName())){
                        resultado = (arquivo.getName() + " não pôde ser transferido para " + outlook.getPath() + " pois já havia um arquivo com o mesmo nome");
                        erro = 1;
                        break;
                    }else{
                        resultado = (arquivo.getName() + " transferido para " + outlook.getPath());
                    }
                }
                nOutlook.add(resultado);
            }

            // ISO

            else if (arquivo.getName().endsWith(".iso") || arquivo.getName().endsWith(".ISO")) {
                iso.mkdir();
                File destino = new File(iso, arquivo.getName());
                File[] listaDestino = iso.listFiles();
                arquivo.renameTo(destino);
                for (File arquivoAtual : listaDestino) {
                    if (arquivoAtual.getName().equals(arquivo.getName())){
                        resultado = (arquivo.getName() + " não pôde ser transferido para " + iso.getPath() + " pois já havia um arquivo com o mesmo nome");
                        erro = 1;
                        break;
                    }else{
                        resultado = (arquivo.getName() + " transferido para " + iso.getPath());
                    }
                }
                nISO.add(resultado);
            }

            // Microsoft

            else if (arquivo.getName().endsWith(".msu") || arquivo.getName().endsWith(".MSU")
                    || arquivo.getName().endsWith(".diagcab") || arquivo.getName().endsWith(".DIAGCAB")
                    || arquivo.getName().endsWith(".msp") || arquivo.getName().endsWith(".MSP")) {
                ms.mkdir();
                File destino = new File(ms, arquivo.getName());
                File[] listaDestino = ms.listFiles();
                arquivo.renameTo(destino);
                for (File arquivoAtual : listaDestino) {
                    if (arquivoAtual.getName().equals(arquivo.getName())){
                        resultado = (arquivo.getName() + " não pôde ser transferido para " + ms.getPath() + " pois já havia um arquivo com o mesmo nome");
                        erro = 1;
                        break;
                    }else{
                        resultado = (arquivo.getName() + " transferido para " + ms.getPath());
                    }
                }
                nMS.add(resultado);
            }

            // Texto

            else if (arquivo.getName().endsWith(".txt") || arquivo.getName().endsWith(".TXT")) {
                texto.mkdir();
                File destino = new File(texto, arquivo.getName());
                File[] listaDestino = texto.listFiles();
                arquivo.renameTo(destino);
                for (File arquivoAtual : listaDestino) {
                    if (arquivoAtual.getName().equals(arquivo.getName())){
                        resultado = (arquivo.getName() + " não pôde ser transferido para " + texto.getPath() + " pois já havia um arquivo com o mesmo nome");
                        erro = 1;
                        break;
                    }else{
                        resultado = (arquivo.getName() + " transferido para " + texto.getPath());
                    }
                }
                nTexto.add(resultado);
            }

            // Outros

            else if (!arquivo.getName().equals("Compactados") && !arquivo.getName().equals("Excel")
                    && !arquivo.getName().equals("Executaveis") && !arquivo.getName().equals("Imagens")
                    && !arquivo.getName().equals("Musicas") && !arquivo.getName().equals("Outros")
                    && !arquivo.getName().equals("PDF") && !arquivo.getName().equals("Powerpoint")
                    && !arquivo.getName().equals("Videos") && !arquivo.getName().equals("Word")
                    && !arquivo.getName().equals("Outlook") && !arquivo.getName().equals("ISO")
                    && !arquivo.getName().equals("Microsoft") && !arquivo.getName().equals("Texto")
                    && !arquivo.getName().equals("Organizador de Arquivos.jar") && !arquivo.getName().equals("Este Computador")
                    && !arquivo.getName().equals("Rede") && !arquivo.getName().equals("Lixeira") && !arquivo.getName().equals("Computador")){
                outros.mkdir();
                File destino = new File(outros, arquivo.getName());
                File[] listaDestino = outros.listFiles();
                arquivo.renameTo(destino);

                for (File arquivoAtual : listaDestino) {
                    if (arquivoAtual.getName().equals(arquivo.getName())){
                        resultado = (arquivo.getName() + " não pôde ser transferido para " + outros.getPath() + " pois já havia um arquivo com o mesmo nome");
                        erro = 1;
                        break;
                    }else{
                        resultado = (arquivo.getName() + " transferido para " + outros.getPath());
                    }
                }
                nOutros.add(resultado);
            }
        }
        FileWriter arq = new FileWriter("Lista de Arquivos transferidos.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.println("Descritivo");
        if (!nMusica.isEmpty()){ /*Verifica se a lista nMusica é vazia*/
            gravarArq.println("Musicas:");
            for (String lMusica:nMusica) {
                gravarArq.println(lMusica);
            }
            gravarArq.println("");
        }
        if (!nPDF.isEmpty()){
            gravarArq.println("PDF:");
            for (String lPDF:nPDF) {
                gravarArq.println(lPDF);
            }
            gravarArq.println("");
        }
        if (!nExec.isEmpty()) {
            gravarArq.println("Executavel:");
            for (String lExe : nExec) {
                gravarArq.println(lExe);
            }
            gravarArq.println("");
        }
        if (!nVideos.isEmpty()){
            gravarArq.println("Videos:");
            for (String lVideos:nVideos) {
                gravarArq.println(lVideos);
            }
            gravarArq.println("");
        }
        if (!nCompac.isEmpty()){
            gravarArq.println("Compactados:");
            for (String lCompac:nCompac) {
                gravarArq.println(lCompac);
            }
            gravarArq.println("");
        }
        if (!nWord.isEmpty()){
            gravarArq.println("Word:");
            for (String lWord:nWord) {
                gravarArq.println(lWord);
            }
            gravarArq.println("");
        }
        if (!nPowerpoint.isEmpty()){
            gravarArq.println("Powerpoint:");
            for (String lPowerpoint:nPowerpoint) {
                gravarArq.println(lPowerpoint);
            }
            gravarArq.println("");
        }
        if (!nExcel.isEmpty()){
            gravarArq.println("Excel:");
            for (String lExcel:nExcel) {
                gravarArq.println(lExcel);
            }
            gravarArq.println("");
        }
        if (!nOutros.isEmpty()){
            gravarArq.println("Outros:");
            for (String lOutros:nOutros) {
                gravarArq.println(lOutros);
            }
            gravarArq.println("");
        }
        if (!nOutlook.isEmpty()){
            gravarArq.println("Outlook:");
            for (String lOutlook:nOutlook) {
                gravarArq.println(lOutlook);
            }
            gravarArq.println("");
        }
        if (!nISO.isEmpty()){
            gravarArq.println("ISO:");
            for (String lISO:nISO) {
                gravarArq.println(lISO);
            }
            gravarArq.println("");
        }
        if (!nMS.isEmpty()){
            gravarArq.println("Microsoft:");
            for (String lMS:nMS) {
                gravarArq.println(lMS);
            }
            gravarArq.println("");
        }
        if (!nImagem.isEmpty()){
            gravarArq.println("Imagem:");
            for (String lImagem:nImagem) {
                gravarArq.println(lImagem);
            }
            gravarArq.println("");
        }
        arq.close();

//		return (ArrayList) colection
        return erro;
    }
    
}
