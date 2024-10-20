package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.preference.g;
import com.android.chrome.R;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Us3 */
/* loaded from: classes.dex */
public abstract class AbstractC2693Us3 extends g {
    public final C2563Ts3 Y;
    public CharSequence Z;
    public CharSequence a0;

    public AbstractC2693Us3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.0_resource_name_obfuscated_res_0x7f05044e);
        this.Y = new C2563Ts3(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.S0, R.attr.0_resource_name_obfuscated_res_0x7f05044e, 0);
        Y(AbstractC9067qZ3.f(obtainStyledAttributes, 7, 0));
        X(AbstractC9067qZ3.f(obtainStyledAttributes, 6, 1));
        this.Z = AbstractC9067qZ3.f(obtainStyledAttributes, 9, 3);
        q();
        this.a0 = AbstractC9067qZ3.f(obtainStyledAttributes, 8, 4);
        q();
        this.X = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        a0(c1812Ny2.v(R.id.switchWidget));
        Z(c1812Ny2.v(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void F(View view) {
        super.F(view);
        if (((AccessibilityManager) this.a.getSystemService("accessibility")).isEnabled()) {
            a0(view.findViewById(R.id.switchWidget));
            Z(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a0(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.T);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.h(this.Z);
            switchCompat.requestLayout();
            if (switchCompat.isChecked() && Build.VERSION.SDK_INT >= 30) {
                Object obj = switchCompat.t;
                if (obj == null) {
                    obj = switchCompat.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140107);
                }
                WeakHashMap weakHashMap = Ec4.a;
                new C6679jc4().e(switchCompat, obj);
            }
            switchCompat.g(this.a0);
            switchCompat.requestLayout();
            if (!switchCompat.isChecked() && Build.VERSION.SDK_INT >= 30) {
                Object obj2 = switchCompat.v;
                if (obj2 == null) {
                    obj2 = switchCompat.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140106);
                }
                WeakHashMap weakHashMap2 = Ec4.a;
                new C6679jc4().e(switchCompat, obj2);
            }
            switchCompat.setOnCheckedChangeListener(this.Y);
        }
    }
}
