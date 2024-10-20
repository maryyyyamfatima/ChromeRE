package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.KeyboardShortcutInfo;
import com.android.chrome.R;
import java.util.ArrayList;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vv1 */
/* loaded from: classes.dex */
public abstract class AbstractC10910vv1 {
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x001d. Please report as an issue. */
    public static Boolean c(KeyEvent keyEvent, boolean z, XU0 xu0, InterfaceC9377rT1 interfaceC9377rT1) {
        int keyCode = keyEvent.getKeyCode();
        if (!z) {
            if (keyCode == 84 || keyCode == 82) {
                return Boolean.TRUE;
            }
            return null;
        }
        if (keyCode == 82) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                interfaceC9377rT1.Y(R.id.show_menu, false);
            }
            return Boolean.TRUE;
        }
        if (keyCode == 84) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                interfaceC9377rT1.Y(R.id.focus_url_bar, false);
            }
            return Boolean.TRUE;
        }
        if (keyCode == 111) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0 && xu0.g()) {
                xu0.f();
                return Boolean.TRUE;
            }
        } else {
            switch (keyCode) {
                default:
                    switch (keyCode) {
                    }
                case 170:
                case 171:
                case 172:
                case 173:
                    return Boolean.FALSE;
            }
        }
        return null;
    }

    public static ArrayList b(Context context) {
        ArrayList arrayList = new ArrayList();
        KeyboardShortcutGroup keyboardShortcutGroup = new KeyboardShortcutGroup(context.getString(R.string.0_resource_name_obfuscated_res_0x7f14058a));
        a(context, keyboardShortcutGroup, R.string.0_resource_name_obfuscated_res_0x7f140583, 42, 4096);
        a(context, keyboardShortcutGroup, R.string.0_resource_name_obfuscated_res_0x7f140588, 48, 4097);
        a(context, keyboardShortcutGroup, R.string.0_resource_name_obfuscated_res_0x7f140580, 42, 4097);
        a(context, keyboardShortcutGroup, R.string.0_resource_name_obfuscated_res_0x7f140581, 61, 4096);
        a(context, keyboardShortcutGroup, R.string.0_resource_name_obfuscated_res_0x7f140584, 61, 4097);
        a(context, keyboardShortcutGroup, R.string.0_resource_name_obfuscated_res_0x7f14057c, 51, 4096);
        arrayList.add(keyboardShortcutGroup);
        KeyboardShortcutGroup keyboardShortcutGroup2 = new KeyboardShortcutGroup(context.getString(R.string.0_resource_name_obfuscated_res_0x7f14057b));
        a(context, keyboardShortcutGroup2, R.string.0_resource_name_obfuscated_res_0x7f140582, 33, 2);
        a(context, keyboardShortcutGroup2, R.string.0_resource_name_obfuscated_res_0x7f140579, 30, 4097);
        a(context, keyboardShortcutGroup2, R.string.0_resource_name_obfuscated_res_0x7f14057f, 36, 4096);
        a(context, keyboardShortcutGroup2, R.string.0_resource_name_obfuscated_res_0x7f14057d, 34, 4096);
        a(context, keyboardShortcutGroup2, R.string.0_resource_name_obfuscated_res_0x7f140578, 40, 4096);
        arrayList.add(keyboardShortcutGroup2);
        KeyboardShortcutGroup keyboardShortcutGroup3 = new KeyboardShortcutGroup(context.getString(R.string.0_resource_name_obfuscated_res_0x7f14058b));
        a(context, keyboardShortcutGroup3, R.string.0_resource_name_obfuscated_res_0x7f140585, 44, 4096);
        a(context, keyboardShortcutGroup3, R.string.0_resource_name_obfuscated_res_0x7f140587, 46, 4096);
        a(context, keyboardShortcutGroup3, R.string.0_resource_name_obfuscated_res_0x7f140586, 46, 4097);
        a(context, keyboardShortcutGroup3, R.string.0_resource_name_obfuscated_res_0x7f14057a, 32, 4096);
        a(context, keyboardShortcutGroup3, R.string.0_resource_name_obfuscated_res_0x7f14058c, 70, 4096);
        a(context, keyboardShortcutGroup3, R.string.0_resource_name_obfuscated_res_0x7f14058d, 69, 4096);
        a(context, keyboardShortcutGroup3, R.string.0_resource_name_obfuscated_res_0x7f140589, 7, 4096);
        a(context, keyboardShortcutGroup3, R.string.0_resource_name_obfuscated_res_0x7f14057e, 76, 4097);
        arrayList.add(keyboardShortcutGroup3);
        return arrayList;
    }

    public static void a(Context context, KeyboardShortcutGroup keyboardShortcutGroup, int i, int i2, int i3) {
        keyboardShortcutGroup.addItem(new KeyboardShortcutInfo(context.getString(i), i2, i3));
    }

    public static boolean d(KeyEvent keyEvent, boolean z, boolean z2, AbstractC11276wz3 abstractC11276wz3, InterfaceC9377rT1 interfaceC9377rT1, C9707sQ3 c9707sQ3) {
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyCode)) {
            if (KeyEvent.isGamepadButton(keyCode)) {
                if (AbstractC5274fX0.a.e) {
                    return false;
                }
            } else if (!keyEvent.isCtrlPressed() && !keyEvent.isAltPressed() && keyCode != 133 && keyCode != 135 && keyCode != 140 && keyCode != 125) {
                return false;
            }
            TabModel g = abstractC11276wz3.g();
            Tab h = abstractC11276wz3.h();
            WebContents b = h == null ? null : h.b();
            int count = g.getCount();
            int i = (keyEvent.isCtrlPressed() ? Integer.MIN_VALUE : 0) | (keyEvent.isAltPressed() ? 1073741824 : 0) | (keyEvent.isShiftPressed() ? 536870912 : 0);
            int i2 = keyCode | i;
            int i3 = R.id.new_incognito_tab_menu_id;
            switch (i2) {
                case -2147483606:
                    interfaceC9377rT1.Y(R.id.new_tab_menu_id, false);
                    return true;
                case -2147483600:
                    if (!g.isIncognito()) {
                        i3 = R.id.new_tab_menu_id;
                    }
                    interfaceC9377rT1.Y(i3, false);
                    return true;
                case -1610612694:
                    interfaceC9377rT1.Y(R.id.new_incognito_tab_menu_id, false);
                    return true;
                case -1610612688:
                    interfaceC9377rT1.Y(R.id.open_recently_closed_tab, false);
                    return true;
                case 100:
                case 140:
                case 1073741857:
                case 1073741858:
                    interfaceC9377rT1.Y(R.id.show_menu, false);
                    return true;
                default:
                    if (z) {
                        if (z2 && (i == Integer.MIN_VALUE || i == 1073741824)) {
                            int i4 = keyCode - 7;
                            if (i4 > 0 && i4 <= Math.min(count, 8)) {
                                g.q(i4 - 1, 3, false);
                                return true;
                            }
                            if (i4 == 9 && count != 0) {
                                g.q(count - 1, 3, false);
                                return true;
                            }
                        }
                        switch (i2) {
                            case -2147483641:
                                Ts4.a(b, -1.0f);
                                return true;
                            case -2147483616:
                            case 174:
                                interfaceC9377rT1.Y(R.id.bookmark_this_page_id, false);
                                return true;
                            case -2147483614:
                            case -2147483613:
                            case -1610612701:
                            case 133:
                            case 536871045:
                                interfaceC9377rT1.Y(R.id.find_in_page_id, false);
                                return true;
                            case -2147483612:
                                interfaceC9377rT1.Y(R.id.open_history_menu_id, false);
                                return true;
                            case -2147483608:
                            case 99:
                            case 1073741856:
                                interfaceC9377rT1.Y(R.id.focus_url_bar, false);
                                return true;
                            case -2147483604:
                                interfaceC9377rT1.Y(R.id.print_id, false);
                                return true;
                            case -2147483602:
                            case -1610612690:
                            case 135:
                            case 536871047:
                                if (h != null) {
                                    if ((i2 & 536870912) == 536870912) {
                                        h.D();
                                    } else {
                                        h.c();
                                    }
                                    if (c9707sQ3 != null && b != null && b.c1()) {
                                        c9707sQ3.D.m();
                                    } else if (h.a() != null) {
                                        h.a().requestFocus();
                                    }
                                }
                                return true;
                            case -2147483597:
                            case -2147483514:
                            case 97:
                                Tab a = AbstractC1558Lz3.a(g);
                                if (a != null) {
                                    g.f(a);
                                }
                                return true;
                            case -2147483587:
                            case -2147483555:
                            case 103:
                                if (z2 && count > 1) {
                                    g.q((g.index() + 1) % count, 3, false);
                                }
                                return true;
                            case -2147483579:
                            case 169:
                                Ts4.a(b, 0.8f);
                                return true;
                            case -2147483578:
                            case -2147483567:
                            case -1610612666:
                            case -1610612655:
                            case 168:
                                Ts4.a(b, 1.25f);
                                return true;
                            case -2147483556:
                            case -1610612675:
                            case 102:
                                if (z2 && count > 1) {
                                    g.q(((g.index() + count) - 1) % count, 3, false);
                                }
                                return true;
                            case -1610612706:
                                interfaceC9377rT1.Y(R.id.all_bookmarks_menu_id, false);
                                return true;
                            case -1610612660:
                                interfaceC9377rT1.Y(R.id.help_id, false);
                                return true;
                            case 108:
                            case 125:
                            case 1073741846:
                                if (h != null && h.j()) {
                                    h.i();
                                }
                                return true;
                            case 1073741845:
                                if (h != null && h.h()) {
                                    h.f();
                                }
                                return true;
                        }
                    }
                    break;
            }
        }
        return false;
    }
}
