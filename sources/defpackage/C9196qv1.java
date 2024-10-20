package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qv1 */
/* loaded from: classes.dex */
public final class C9196qv1 extends AbstractC9538rv1 {
    @Override // defpackage.AbstractC9538rv1
    public final void v(C5416fv1 c5416fv1, View view) {
        TextView textView = (TextView) view;
        final C1142Iu1 c1142Iu1 = c5416fv1.b;
        textView.setText(c1142Iu1.a);
        textView.setOnClickListener(new View.OnClickListener() { // from class: pv1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C1142Iu1 c1142Iu12 = C1142Iu1.this;
                c1142Iu12.b.onResult(c1142Iu12);
            }
        });
    }

    public C9196qv1(int i, RecyclerView recyclerView) {
        super(i, recyclerView);
    }
}
