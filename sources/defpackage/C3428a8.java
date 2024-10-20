package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: a8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3428a8 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C5146f8 a;
    public final /* synthetic */ C4115c8 g;

    public C3428a8(C4115c8 c4115c8, C5146f8 c5146f8) {
        this.g = c4115c8;
        this.a = c5146f8;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C4115c8 c4115c8 = this.g;
        DialogInterface.OnClickListener onClickListener = c4115c8.p;
        C5146f8 c5146f8 = this.a;
        onClickListener.onClick(c5146f8.b, i);
        if (c4115c8.t) {
            return;
        }
        c5146f8.b.dismiss();
    }
}
