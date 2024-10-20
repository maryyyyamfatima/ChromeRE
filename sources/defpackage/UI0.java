package defpackage;

import android.content.Context;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.content_public.browser.LoadUrlParams;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class UI0 implements QI0 {
    public final InterfaceC8544p12 a;
    public final BookmarkBridge b;
    public final Context c;
    public final ViewOnClickListenerC1069If3 d;
    public final C4270cc0 e;

    @Override // defpackage.QI0
    public void a() {
    }

    @Override // defpackage.QI0
    public void b() {
    }

    public UI0(Context context, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, InterfaceC8544p12 interfaceC8544p12, BookmarkBridge bookmarkBridge, C4270cc0 c4270cc0) {
        this.c = context;
        this.a = interfaceC8544p12;
        this.b = bookmarkBridge;
        this.d = viewOnClickListenerC1069If3;
        this.e = c4270cc0;
    }

    @Override // defpackage.QI0
    public void c() {
        this.a.d(1, new LoadUrlParams("https://support.google.com/chrome/?p=new_tab", 2));
    }
}
