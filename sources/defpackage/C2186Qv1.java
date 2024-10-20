package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qv1 */
/* loaded from: classes.dex */
public final class C2186Qv1 extends ContentObserver {
    public final /* synthetic */ InterfaceC2316Rv1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2186Qv1(Handler handler, C1536Lv1 c1536Lv1) {
        super(handler);
        this.a = c1536Lv1;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        if (uri == null) {
            AbstractC4851eH1.f("KnoxSettingsProvider", "Observed change for null URI", new Object[0]);
            return;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() < 1 || pathSegments.size() > 2) {
            AbstractC4851eH1.f("KnoxSettingsProvider", "Observed change for unknown URI " + uri, new Object[0]);
        } else {
            String str = pathSegments.get(0);
            String str2 = pathSegments.size() == 2 ? pathSegments.get(1) : "";
            C2056Pv1 c2056Pv1 = ((C1536Lv1) this.a).a;
            c2056Pv1.getClass();
            new C1926Ov1(c2056Pv1, str, str2, uri).c(AbstractC0185Bl.f);
        }
    }
}
