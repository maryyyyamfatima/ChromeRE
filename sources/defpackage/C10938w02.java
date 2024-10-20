package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.CheckBox;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: w02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10938w02 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ CheckBox g;
    public final /* synthetic */ A02 h;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C10938w02(A02 a02, int i, CheckBox checkBox) {
        this.h = a02;
        this.a = i;
        this.g = checkBox;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String trim = charSequence.toString().trim();
        if (TextUtils.isEmpty(trim)) {
            return;
        }
        A02 a02 = this.h;
        a02.a[this.a] = true;
        this.g.setChecked(true);
        a02.g = trim;
        a02.h.a(new C11624y02(trim, a02.a));
    }
}
