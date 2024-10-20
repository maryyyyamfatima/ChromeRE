package defpackage;

import org.chromium.components.page_info.PageInfoController;
import org.chromium.ui.base.Clipboard;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jg2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1203Jg2 implements Runnable {
    public final /* synthetic */ PageInfoController a;

    public /* synthetic */ RunnableC1203Jg2(PageInfoController pageInfoController) {
        this.a = pageInfoController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PageInfoController pageInfoController = this.a;
        pageInfoController.getClass();
        Clipboard.getInstance().b(pageInfoController.n);
    }
}
