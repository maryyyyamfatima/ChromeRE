package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.components.query_tiles.QueryTile;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jM3 */
/* loaded from: classes2.dex */
public final class C6596jM3 extends AbstractC10743vS0 implements PK2 {
    public final C4191cM3 g;

    @Override // defpackage.PK2
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // defpackage.PK2
    public final void b(Object obj, int i, Object obj2) {
        final FM3 fm3 = (FM3) obj;
        C4191cM3 c4191cM3 = this.g;
        final PropertyModel propertyModel = c4191cM3.h;
        final QueryTile queryTile = (QueryTile) c4191cM3.get(i);
        View view = fm3.a;
        ((TextView) view.findViewById(R.id.title)).setText(queryTile.b);
        view.setOnClickListener(new View.OnClickListener() { // from class: DM3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ((Callback) PropertyModel.this.i(InterfaceC4535dM3.a)).onResult(queryTile);
            }
        });
        fm3.v(null);
        ((InterfaceC4994ei1) propertyModel.i(InterfaceC4535dM3.b)).a(queryTile, new Callback() { // from class: EM3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj3) {
                return new ZE(this, obj3);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj3) {
                Bitmap bitmap;
                List list = (List) obj3;
                FM3 fm32 = FM3.this;
                if (list != null) {
                    fm32.getClass();
                    if (!list.isEmpty()) {
                        bitmap = (Bitmap) list.get(0);
                        fm32.v(bitmap);
                    }
                }
                bitmap = null;
                fm32.v(bitmap);
            }
        });
    }

    @Override // defpackage.PK2
    public final void g(Object obj) {
        ((FM3) obj).getClass();
    }

    public C6596jM3(C4191cM3 c4191cM3) {
        this.g = c4191cM3;
        c4191cM3.l(this);
    }

    @Override // defpackage.PK2
    public final int a() {
        return this.g.size();
    }
}
