# Aulas_Quarto-Semetre_ARQUITETURA-DE-SOFTWARE


# Configurações globais do Git
git config --global user.name "Genivaldo2230"
git config --global user.email "gda_anjos@hotmail.com.br"
git config --global core.editor "notepad++"  # Substitua pelo seu editor preferido (ex: "nano", "vim", "code")

# Configuração de cores para saída do Git
git config --global color.ui true

# Configuração de rebase automático após "git pull"
git config --global pull.rebase true

# Configuração para manter o histórico de rebase limpo
git config --global rebase.autosquash true

# Configuração para sempre criar um "merge commit" em vez de um "fast-forward" no "git merge"
git config --global merge.ff only

# Configuração de ferramenta para resolver conflitos (ex: "vimdiff", "meld", "code" etc.)
git config --global merge.tool ferramenta-de-sua-escolha

# Configuração de diferenças (ex: "vimdiff", "meld", "code" etc.) para visualizar diferenças entre arquivos
git config --global diff.tool ferramenta-de-sua-escolha

# Configuração para evitar que arquivos automaticamente gerados (ex: IDE, compiladores) sejam incluídos nos commits
git config --global core.excludesfile ~/.gitignore_global

# Configuração para mostrar abreviações em comandos Git
git config --global alias.lg "log --oneline --decorate --all --graph"
git config --global alias.co checkout
git config --global alias.br branch
git config --global alias.ci commit
git config --global alias.st status
git config --global alias.df diff
git config --global alias.mg merge
git config --global alias.rb rebase

# Configuração para autocorreção de comandos mal digitados
git config --global help.autocorrect 1
# Aulas_Quarto-Semetre_ARQUITETURA-DE-SOFTWARE
