package defpackage;

import org.chromium.chrome.browser.contextmenu.ContextMenuListView;
import org.chromium.chrome.browser.contextmenu.ContextMenuNativeDelegateImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: o60 */
/* loaded from: classes.dex */
public final class C8229o60 {
    public WebContents a;
    public C7885n60 b;
    public ViewOnClickListenerC3761b60 c;
    public C10286u60 d;
    public ContextMenuListView e;
    public final float f;
    public DialogC9943t60 g;
    public Runnable h;
    public final ContextMenuNativeDelegateImpl i;

    public C8229o60(float f, ContextMenuNativeDelegateImpl contextMenuNativeDelegateImpl) {
        this.f = f;
        this.i = contextMenuNativeDelegateImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0159 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0105  */
    /* JADX WARN: Type inference failed for: r9v7, types: [d60] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(org.chromium.ui.base.WindowAndroid r25, org.chromium.content_public.browser.WebContents r26, org.chromium.components.embedder_support.contextmenu.ContextMenuParams r27, java.util.List r28, final org.chromium.base.Callback r29, final java.lang.Runnable r30, java.lang.Runnable r31, final defpackage.NK r32) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8229o60.b(org.chromium.ui.base.WindowAndroid, org.chromium.content_public.browser.WebContents, org.chromium.components.embedder_support.contextmenu.ContextMenuParams, java.util.List, org.chromium.base.Callback, java.lang.Runnable, java.lang.Runnable, NK):void");
    }

    public final void a() {
        T8 t8;
        C7885n60 c7885n60 = this.b;
        if (c7885n60 != null) {
            c7885n60.destroy();
        }
        ViewOnClickListenerC3761b60 viewOnClickListenerC3761b60 = this.c;
        if (viewOnClickListenerC3761b60 != null && (t8 = viewOnClickListenerC3761b60.h) != null && t8.c()) {
            viewOnClickListenerC3761b60.h.b();
        }
        this.g.dismiss();
    }
}
