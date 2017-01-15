package br.tiagohm.codeview;

public abstract class SyntaxHighlighter
{
    private Theme mTheme;

    public abstract String getHtmlCode(String code, Language lang);

    public Theme getTheme()
    {
        return mTheme;
    }

    public void setTheme(Theme theme)
    {
        mTheme = theme;
    }
}
