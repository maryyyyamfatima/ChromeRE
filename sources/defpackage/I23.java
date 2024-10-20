package defpackage;

import android.content.DialogInterface;
import android.widget.ListView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class I23 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ListView a;
    public final /* synthetic */ M23 g;

    public I23(M23 m23, ListView listView) {
        this.g = m23;
        this.a = listView;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.g.d(M23.c(this.a));
    }
}
