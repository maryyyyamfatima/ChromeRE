package defpackage;

import J.N;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.android.chrome.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.locale.LocaleManager;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xL */
/* loaded from: classes.dex */
public final class C11393xL extends ActionMode.Callback2 {
    public final Tab a;
    public final SelectionPopupControllerImpl b;
    public final Callback c;
    public final InterfaceC0079Ap3 d;
    public final boolean e;
    public long f;

    public C11393xL(Tab tab, WebContents webContents, Callback callback, InterfaceC0079Ap3 interfaceC0079Ap3, boolean z) {
        this.a = tab;
        SelectionPopupControllerImpl k = SelectionPopupControllerImpl.k(webContents);
        k.getClass();
        this.b = k;
        this.c = callback;
        this.d = interfaceC0079Ap3;
        this.e = z;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.f = System.currentTimeMillis();
        int i = AbstractC10385uP0.a() ? 7 : 5;
        SelectionPopupControllerImpl selectionPopupControllerImpl = this.b;
        selectionPopupControllerImpl.t = i;
        actionMode.setTitle(DeviceFormFactor.b(selectionPopupControllerImpl.i) ? selectionPopupControllerImpl.h.getString(R.string.0_resource_name_obfuscated_res_0x7f1401b6) : null);
        actionMode.setSubtitle((CharSequence) null);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        SelectionPopupControllerImpl selectionPopupControllerImpl = this.b;
        if (!selectionPopupControllerImpl.t()) {
            return true;
        }
        int itemId = menuItem.getItemId();
        Tab tab = this.a;
        if (itemId != R.id.select_action_menu_web_search) {
            InterfaceC0079Ap3 interfaceC0079Ap3 = this.d;
            if ((!((J63) interfaceC0079Ap3.get()).g) && menuItem.getItemId() == R.id.select_action_menu_share) {
                FI2.a("MobileActionMode.Share");
                EI2.k(System.currentTimeMillis() - this.f, "ContextMenu.TimeToSelectShare");
                J63 j63 = (J63) interfaceC0079Ap3.get();
                WindowAndroid m = tab.m();
                String str = selectionPopupControllerImpl.A;
                if (!TextUtils.isEmpty(str) && str.length() >= 100000) {
                    str = str.substring(0, 100000) + "…";
                }
                String str2 = str;
                String str3 = "";
                if (!TextUtils.isEmpty("") && !TextUtils.isEmpty("")) {
                    str3 = ((GURL) N.M1WDPiaY("")).i();
                }
                j63.c(new C6862k73(m, "", str2, null, str3, null, null, null, null, null, null, null, null, null), new EP(true, false, false, null, null, false, false, false, selectionPopupControllerImpl.l, 3), 4);
            } else {
                return selectionPopupControllerImpl.v(actionMode, menuItem);
            }
        } else {
            final String str4 = selectionPopupControllerImpl.A;
            LocaleManager.getInstance().c(AbstractC7239lD3.b(tab), new Callback() { // from class: wL
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Boolean bool = (Boolean) obj;
                    C11393xL c11393xL = C11393xL.this;
                    c11393xL.getClass();
                    if (bool == null || !bool.booleanValue()) {
                        return;
                    }
                    FI2.a("MobileActionMode.WebSearch");
                    c11393xL.c.onResult(str4);
                }
            });
            selectionPopupControllerImpl.j();
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        FI2.a("MobileActionBarShown.Floating");
        this.b.w(actionMode, menu);
        List b = AbstractC3017Xf2.b(AbstractC3017Xf2.a, 983040);
        HashSet hashSet = new HashSet();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            hashSet.add(((ResolveInfo) it.next()).activityInfo.packageName);
        }
        List b2 = AbstractC3017Xf2.b(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"), 131072);
        HashSet hashSet2 = new HashSet();
        Iterator it2 = b2.iterator();
        while (it2.hasNext()) {
            hashSet2.add(((ResolveInfo) it2.next()).activityInfo.packageName);
        }
        for (int i = 0; i < menu.size(); i++) {
            MenuItem item = menu.getItem(i);
            if (item.getGroupId() == R.id.select_action_menu_text_processing_menus && item.getIntent() != null && item.getIntent().getComponent() != null) {
                String packageName = item.getIntent().getComponent().getPackageName();
                if (hashSet.contains(packageName) || hashSet2.contains(packageName)) {
                    item.setVisible(false);
                }
            }
        }
        if (menu.findItem(R.id.select_action_menu_share) != null) {
            if (actionMode.getType() == 1) {
                Tab tab = this.a;
                View a = tab.a();
                int dimensionPixelSize = a.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08038d);
                Rect rect = new Rect(a.getWidth() / 2, dimensionPixelSize, a.getWidth() / 2, dimensionPixelSize);
                Q44 q44 = new Q44(AbstractC7239lD3.b(tab), new Handler());
                C12180ze1 c12180ze1 = new C12180ze1(a.getResources(), "IPH_SharedHighlightingBuilder", R.string.0_resource_name_obfuscated_res_0x7f140565, R.string.0_resource_name_obfuscated_res_0x7f140565);
                c12180ze1.p = rect;
                c12180ze1.h = a;
                c12180ze1.q = true;
                q44.a(c12180ze1.a());
            }
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        rect.set(this.b.q());
        if (this.e) {
            int width = view.getWidth() / 4;
            if (rect.right - (width * 3) > 0) {
                rect.offset(-(view.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08015c) + width), 0);
            }
        }
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        SelectionPopupControllerImpl selectionPopupControllerImpl = this.b;
        selectionPopupControllerImpl.r = null;
        selectionPopupControllerImpl.s.p(Boolean.valueOf(selectionPopupControllerImpl.t()));
        if (selectionPopupControllerImpl.z) {
            selectionPopupControllerImpl.e();
        }
    }
}
