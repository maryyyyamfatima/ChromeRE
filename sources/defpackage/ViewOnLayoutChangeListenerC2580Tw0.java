package defpackage;

import android.view.View;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tw0 */
/* loaded from: classes2.dex */
public final class ViewOnLayoutChangeListenerC2580Tw0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ ViewOnClickListenerC2970Ww0 a;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewOnClickListenerC2970Ww0 viewOnClickListenerC2970Ww0 = this.a;
        AutoCompleteTextView autoCompleteTextView = viewOnClickListenerC2970Ww0.i;
        WeakHashMap weakHashMap = Ec4.a;
        autoCompleteTextView.setPaddingRelative(autoCompleteTextView.getPaddingStart(), viewOnClickListenerC2970Ww0.i.getPaddingTop(), viewOnClickListenerC2970Ww0.j.getWidth(), viewOnClickListenerC2970Ww0.i.getPaddingBottom());
    }

    public ViewOnLayoutChangeListenerC2580Tw0(ViewOnClickListenerC2970Ww0 viewOnClickListenerC2970Ww0) {
        this.a = viewOnClickListenerC2970Ww0;
    }
}
