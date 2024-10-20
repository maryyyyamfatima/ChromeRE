package defpackage;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10692vI extends ArrayAdapter {
    public final /* synthetic */ C11035wI a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10692vI(C11035wI c11035wI, Context context, ArrayList arrayList) {
        super(context, R.layout.simple_spinner_item, arrayList);
        this.a = c11035wI;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) super.getView(i, view, viewGroup);
        int i2 = this.a.g;
        WeakHashMap weakHashMap = Ec4.a;
        textView.setPaddingRelative(i2, i2, i2 * 2, i2);
        return textView;
    }
}
