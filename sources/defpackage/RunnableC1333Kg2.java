package defpackage;

import org.chromium.components.page_info.PageInfoController;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kg2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1333Kg2 implements Runnable {
    public final /* synthetic */ PageInfoController a;

    public /* synthetic */ RunnableC1333Kg2(PageInfoController pageInfoController) {
        this.a = pageInfoController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7739mh2 c7739mh2 = this.a.m;
        if (c7739mh2 != null) {
            c7739mh2.b(true);
        }
    }
}
