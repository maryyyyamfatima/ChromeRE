package defpackage;

import android.app.Activity;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.bookmarks.BookmarkId;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Uu3 */
/* loaded from: classes.dex */
public final class C2703Uu3 {
    public final Activity a;
    public final InterfaceC7697ma2 b;
    public final InterfaceC0079Ap3 c;
    public final InterfaceC0079Ap3 d;
    public final boolean e;

    public C2703Uu3(Activity activity, C8385oa2 c8385oa2, AL al, BL bl, boolean z) {
        this.a = activity;
        this.b = c8385oa2;
        this.c = al;
        this.d = bl;
        this.e = z;
    }

    public final void b(Tab tab) {
        BookmarkId l = ((BookmarkBridge) ((C8385oa2) this.b).g).l(tab);
        if (l == null) {
            a(0, tab, true);
        } else {
            WA.g(this.a, (QB) this.c.get(), true, l, false);
        }
    }

    public final void a(final int i, final Tab tab, final boolean z) {
        BookmarkBridge bookmarkBridge;
        if (tab == null || tab.l() || (bookmarkBridge = (BookmarkBridge) ((C8385oa2) this.b).g) == null || !bookmarkBridge.m()) {
            return;
        }
        final C8938qA c8938qA = new C8938qA();
        c8938qA.e(new Runnable() { // from class: Su3
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException
                */
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    Method dump skipped, instructions count: 445
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC2443Su3.run():void");
            }
        });
    }
}
