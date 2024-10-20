package defpackage;

import android.content.res.Resources;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.components.bookmarks.BookmarkId;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sx2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2457Sx2 implements InterfaceC0679Ff3 {
    public final /* synthetic */ InterfaceC0984Ho3 a;
    public final /* synthetic */ BookmarkBridge g;
    public final /* synthetic */ BookmarkId h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ ViewOnClickListenerC1069If3 j;
    public final /* synthetic */ Resources k;
    public final /* synthetic */ Callback l;

    @Override // defpackage.InterfaceC0679Ff3
    public final /* synthetic */ void a(Object obj) {
    }

    public C2457Sx2(InterfaceC0984Ho3 interfaceC0984Ho3, BookmarkBridge bookmarkBridge, BookmarkId bookmarkId, boolean z, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, Resources resources, Callback callback) {
        this.a = interfaceC0984Ho3;
        this.g = bookmarkBridge;
        this.h = bookmarkId;
        this.i = z;
        this.j = viewOnClickListenerC1069If3;
        this.k = resources;
        this.l = callback;
    }

    @Override // defpackage.InterfaceC0679Ff3
    public final void b(Object obj) {
        AbstractC2717Ux2.f(this.a, this.g, this.h, this.i, this.j, this.k, this.l);
    }
}
