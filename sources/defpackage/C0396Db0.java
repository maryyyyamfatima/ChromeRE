package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.chromium.chrome.browser.autofill.PersonalDataManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Db0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0396Db0 implements TextWatcher {
    public boolean a = true;
    public boolean g;
    public boolean h;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.g || !this.a || i3 <= 0) {
            return;
        }
        int i4 = i3 + i;
        if ((TextUtils.indexOf(charSequence, " ", i, i4) == -1 && TextUtils.indexOf(charSequence, "-", i, i4) == -1) ? false : true) {
            this.a = false;
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.g) {
            return;
        }
        this.g = true;
        if (!this.a) {
            if (this.h && editable.length() <= 16) {
                this.h = false;
                this.a = true;
                a(editable);
            }
        } else {
            int indexOf = TextUtils.indexOf(editable, " ");
            while (indexOf >= 0) {
                int i = indexOf + 1;
                editable.delete(indexOf, i);
                indexOf = TextUtils.indexOf(editable, " ", i);
            }
            if (editable.length() > 16) {
                this.h = true;
                this.a = false;
            } else {
                a(editable);
            }
        }
        if (editable.length() == 0) {
            this.a = true;
        }
        this.g = false;
    }

    public static void a(Editable editable) {
        for (int i : PersonalDataManager.d().b(editable.toString(), false).equals("amex") ? new int[]{4, 11} : new int[]{4, 9, 14}) {
            if (editable.length() > i) {
                editable.insert(i, " ");
            }
        }
    }
}
