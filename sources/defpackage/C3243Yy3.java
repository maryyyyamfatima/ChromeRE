package defpackage;

import J.N;
import android.app.Activity;
import android.view.ViewGroup;
import org.chromium.base.SysUtils;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.tasks.tab_management.n;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yy3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3243Yy3 {
    public static n a(Activity activity, I5 i5, InterfaceC10590uz3 interfaceC10590uz3, TabContentManager tabContentManager, JC jc, InterfaceC10912vv3 interfaceC10912vv3, InterfaceC9377rT1 interfaceC9377rT1, ViewGroup viewGroup, InterfaceC0079Ap3 interfaceC0079Ap3, C7507m02 c7507m02, OX2 ox2, ViewGroup viewGroup2, InterfaceC0079Ap3 interfaceC0079Ap32, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, ZX1 zx1) {
        int i = 0;
        if (RC.a().e()) {
            N.MT4iKtWs("TabGridLayoutAndroidSyntheticTrial", "Downloaded_Enabled", 0);
        }
        if (AbstractC5177fD3.d(activity) && SysUtils.isLowEndDevice()) {
            i = 3;
        }
        return new n(activity, i5, interfaceC10590uz3, tabContentManager, jc, interfaceC10912vv3, interfaceC9377rT1, viewGroup, interfaceC0079Ap3, c7507m02, ox2, i, viewGroup2, interfaceC0079Ap32, viewOnClickListenerC1069If3, zx1);
    }
}
