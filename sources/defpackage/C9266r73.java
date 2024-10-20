package defpackage;

import java.util.Collections;
import java.util.Set;
import org.chromium.base.task.PostTask;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: r73 */
/* loaded from: classes2.dex */
public final class C9266r73 implements InterfaceC7550m73 {
    public static final Set h = Collections.unmodifiableSet(AbstractC9048qW.d("avif", "bmp", "css", "csv", "ehtml", "flac", "gif", "htm", "html", "ico", "jfif", "jpeg", "jpg", "m4a", "m4v", "mp3", "mp4", "mpeg", "mpg", "oga", "ogg", "ogm", "ogv", "opus", "pdf", "pjp", "pjpeg", "png", "shtm", "shtml", "svg", "svgz", "text", "tif", "tiff", "txt", "wav", "weba", "webm", "webp", "xbm"));
    public static final Set i = Collections.unmodifiableSet(AbstractC9048qW.d("audio/flac", "application/pdf", "audio/mp3", "audio/mpeg", "audio/ogg", "audio/wav", "audio/webm", "audio/x-m4a", "image/avif", "image/bmp", "image/gif", "image/jpeg", "image/png", "image/svg+xml", "image/tiff", "image/webp", "image/x-icon", "image/x-ms-bmp", "image/x-xbitmap", "text/comma-separated-values", "text/css", "text/csv", "text/html", "text/plain", "video/mp4", "video/mpeg", "video/ogg", "video/webm"));
    public static final N33 j = PostTask.a(QF3.k);
    public final WindowAndroid a;
    public final InterfaceC8924q73 g;

    @Override // defpackage.D30
    public final void b(HY1 hy1) {
    }

    @Override // defpackage.InterfaceC7786mp1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public C9266r73(WebContents webContents, C9609s73 c9609s73) {
        this.a = webContents.Q0();
        this.g = c9609s73;
    }

    @Override // defpackage.InterfaceC7550m73
    public final void x(String str, String str2, U24 u24, E83[] e83Arr, C12010z73 c12010z73) {
        EI2.h(0, 2, "WebShare.ApiCount");
        C9609s73 c9609s73 = (C9609s73) this.g;
        if (!(((C8385oa2) c9609s73.a.b).g != null)) {
            EI2.h(1, 3, "WebShare.ShareOutcome");
            c12010z73.a(1);
            return;
        }
        C7894n73 c7894n73 = new C7894n73(c12010z73);
        C6176i73 c6176i73 = new C6176i73(this.a, str, u24.b);
        c6176i73.c = str2;
        c6176i73.g = c7894n73;
        if (e83Arr == null || e83Arr.length == 0) {
            c9609s73.a(c6176i73.a());
            return;
        }
        if (e83Arr.length > 10) {
            c12010z73.a(2);
            return;
        }
        for (E83 e83 : e83Arr) {
            String str3 = e83.b.b.b;
            if (!(str3.indexOf(46) <= 0 || !h.contains(AbstractC7974nN0.a(str3)))) {
                if (!(!i.contains(e83.c.c))) {
                }
            }
            AbstractC4851eH1.d("share", "Cannot share potentially dangerous \"" + e83.c.c + "\" file \"" + e83.b + "\".", new Object[0]);
            c12010z73.a(2);
            return;
        }
        new C8581p73(this, c12010z73, e83Arr, c6176i73).d(j);
    }
}
