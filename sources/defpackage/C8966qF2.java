package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;
import java.util.ArrayList;
import org.chromium.components.webapps.bottomsheet.PwaBottomSheetController;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qF2 */
/* loaded from: classes2.dex */
public final class C8966qF2 extends AbstractC8305oK2 {
    public final Context i;
    public final ArrayList j = new ArrayList();

    @Override // defpackage.AbstractC8305oK2
    public final void C(d dVar, int i) {
        final Bitmap bitmap = (Bitmap) this.j.get(i);
        ImageView imageView = (ImageView) ((C8280oF2) dVar).a;
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        imageView.setAdjustViewBounds(true);
        imageView.setImageBitmap(bitmap);
        imageView.setContentDescription(this.i.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140910));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: pF2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8966qF2 c8966qF2 = C8966qF2.this;
                c8966qF2.getClass();
                new AlertDialogC7056ki1(c8966qF2.i, bitmap).show();
            }
        });
    }

    public C8966qF2(PwaBottomSheetController pwaBottomSheetController, Context context) {
        this.i = context;
    }

    @Override // defpackage.AbstractC8305oK2
    public final d E(int i, RecyclerView recyclerView) {
        return new C8280oF2(new ImageView(this.i));
    }

    @Override // defpackage.AbstractC8305oK2
    public final int q() {
        ArrayList arrayList = this.j;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }
}
