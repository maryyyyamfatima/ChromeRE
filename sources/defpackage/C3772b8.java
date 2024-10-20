package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: b8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3772b8 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController$RecycleListView a;
    public final /* synthetic */ C5146f8 g;
    public final /* synthetic */ C4115c8 h;

    public C3772b8(C4115c8 c4115c8, AlertController$RecycleListView alertController$RecycleListView, C5146f8 c5146f8) {
        this.h = c4115c8;
        this.a = alertController$RecycleListView;
        this.g = c5146f8;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C4115c8 c4115c8 = this.h;
        boolean[] zArr = c4115c8.r;
        AlertController$RecycleListView alertController$RecycleListView = this.a;
        if (zArr != null) {
            zArr[i] = alertController$RecycleListView.isItemChecked(i);
        }
        c4115c8.v.onClick(this.g.b, i, alertController$RecycleListView.isItemChecked(i));
    }
}
