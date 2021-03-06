package com.vitco.app.layout.content;

import com.vitco.app.layout.content.console.ConsoleInterface;
import com.vitco.app.layout.content.shortcut.ShortcutManagerInterface;
import com.vitco.app.manager.action.ActionGroupManagerInterface;
import com.vitco.app.manager.action.ActionManager;
import com.vitco.app.manager.action.ComplexActionManager;
import com.vitco.app.manager.error.ErrorHandlerInterface;
import com.vitco.app.manager.lang.LangSelectorInterface;
import com.vitco.app.manager.menu.MenuGeneratorInterface;
import com.vitco.app.manager.pref.PreferencesInterface;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Prototype of a view object
 */
public abstract class ViewPrototype {

    // var & setter
    protected ActionManager actionManager;
    @Autowired(required=true)
    public final void setActionManager(ActionManager actionManager) {
        this.actionManager = actionManager;
    }

    // var & setter
    protected ComplexActionManager complexActionManager;
    @Autowired(required=true)
    public final void setComplexActionManager(ComplexActionManager complexActionManager) {
        this.complexActionManager = complexActionManager;
    }

    // var & setter
    protected ActionGroupManagerInterface actionGroupManager;
    @Autowired(required=true)
    public final void setActionGroupManager(ActionGroupManagerInterface actionGroupManager) {
        this.actionGroupManager = actionGroupManager;
    }

    // var & setter
    protected MenuGeneratorInterface menuGenerator;
    @Autowired(required=true)
    public final void setMenuGenerator(MenuGeneratorInterface menuGenerator) {
        this.menuGenerator = menuGenerator;
    }

    // var & setter
    protected ConsoleInterface console;
    @Autowired(required=true)
    public final void setConsole(ConsoleInterface console) {
        this.console = console;
    }

    // var & setter
    protected PreferencesInterface preferences;
    @Autowired(required=true)
    public final void setPreferences(PreferencesInterface preferences) {
        this.preferences = preferences;
    }

    // var & setter
    protected ShortcutManagerInterface shortcutManager;
    @Autowired(required=true)
    public final void setShortcutManager(ShortcutManagerInterface shortcutManager) {
        this.shortcutManager = shortcutManager;
    }

    // var & setter
    protected LangSelectorInterface langSelector;
    @Autowired(required=true)
    public final void setLangSelector(LangSelectorInterface langSelector) {
        this.langSelector = langSelector;
    }

    // var & setter
    protected ErrorHandlerInterface errorHandler;
    @Autowired(required=true)
    public final void setErrorHandler(ErrorHandlerInterface errorHandler) {
        this.errorHandler = errorHandler;
    }

}
