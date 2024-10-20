package defpackage;

import android.content.ComponentName;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ql, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9134ql implements InterfaceC9819sl {
    public final LoadUrlParams a;
    public final WebContents b;
    public final Integer c;
    public final ComponentName d;

    @Override // defpackage.InterfaceC9819sl
    public final Tab a() {
        return null;
    }

    @Override // defpackage.InterfaceC9819sl
    public final WebContents b() {
        return this.b;
    }

    public C9134ql(LoadUrlParams loadUrlParams, WebContents webContents, Integer num, ComponentName componentName) {
        this.a = loadUrlParams;
        this.c = num;
        this.b = webContents;
        this.d = componentName;
    }
}
