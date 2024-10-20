package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;

/* JADX WARN: Classes with same name are omitted:
  assets/webapk8.dex
 */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5097f implements InterfaceC7379le4 {
    public boolean a = false;
    public int b;
    public final /* synthetic */ ActionBarContextView c;

    public C5097f(ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
    }

    @Override // defpackage.InterfaceC7379le4
    public final void c() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.a = false;
    }

    @Override // defpackage.InterfaceC7379le4
    public final void a() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.c;
        actionBarContextView.k = null;
        super/*android.view.ViewGroup*/.setVisibility(this.b);
    }

    @Override // defpackage.InterfaceC7379le4
    public final void b(View view) {
        this.a = true;
    }
}
