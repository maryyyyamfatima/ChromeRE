package defpackage;

import J.N;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import org.chromium.components.translate.TranslateMessage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class UW3 extends DataSetObserver implements ZC1 {
    public WeakReference a;
    public final /* synthetic */ TranslateMessage g;

    public UW3(TranslateMessage translateMessage) {
        this.g = translateMessage;
    }

    @Override // defpackage.ZC1
    public final LI2 a(View view) {
        ViewTreeObserverOnGlobalLayoutListenerC8754pe4 a = YC1.a(view);
        this.a = new WeakReference(a);
        return a;
    }

    @Override // defpackage.ZC1
    public final TC1 b() {
        TranslateMessage translateMessage = this.g;
        Context context = translateMessage.a;
        long j = translateMessage.d;
        return new WW3(context, translateMessage, this, j == 0 ? null : (TranslateMessage.MenuItem[]) N.MZGYXqwU(j));
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        LI2 li2 = (LI2) this.a.get();
        if (li2 != null) {
            Rect rect = li2.a;
            rect.set(rect);
            T8 t8 = li2.g;
            if (t8 != null) {
                t8.f();
            }
        }
    }
}
