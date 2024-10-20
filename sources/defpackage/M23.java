package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseBooleanArray;
import android.view.WindowManager;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.android.chrome.R;
import java.util.ArrayList;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class M23 implements G23 {
    public static final int[] d = {R.attr.f12170_resource_name_obfuscated_res_0x7f0503ee, R.attr.f12180_resource_name_obfuscated_res_0x7f0503ef};
    public final AlertDialog a;
    public final Callback b;
    public boolean c;

    public M23(Context context, F23 f23, ArrayList arrayList, boolean z, int[] iArr) {
        this.b = f23;
        ListView listView = new ListView(context);
        listView.setCacheColorHint(0);
        AlertDialog a = C9225r04.d().a(context);
        this.a = a;
        a.setView(listView);
        a.setCancelable(true);
        a.setInverseBackgroundForced(true);
        if (z) {
            a.setButton(-1, a.getContext().getString(android.R.string.ok), new I23(this, listView));
            a.setButton(-2, a.getContext().getString(android.R.string.cancel), new J23(this));
        }
        Context context2 = a.getContext();
        TypedArray obtainStyledAttributes = a.getContext().obtainStyledAttributes(R.style.f97940_resource_name_obfuscated_res_0x7f15026e, d);
        int resourceId = obtainStyledAttributes.getResourceId(!z ? 1 : 0, 0);
        obtainStyledAttributes.recycle();
        listView.setAdapter((ListAdapter) new H23(resourceId, context2, arrayList));
        listView.setFocusableInTouchMode(true);
        if (z) {
            listView.setChoiceMode(2);
            for (int i : iArr) {
                listView.setItemChecked(i, true);
            }
        } else {
            listView.setChoiceMode(1);
            listView.setOnItemClickListener(new K23(this, listView));
            if (iArr.length > 0) {
                listView.setSelection(iArr[0]);
                listView.setItemChecked(iArr[0], true);
            }
        }
        this.a.setOnCancelListener(new L23(this));
    }

    public static int[] c(ListView listView) {
        SparseBooleanArray checkedItemPositions = listView.getCheckedItemPositions();
        int i = 0;
        for (int i2 = 0; i2 < checkedItemPositions.size(); i2++) {
            if (checkedItemPositions.valueAt(i2)) {
                i++;
            }
        }
        int[] iArr = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < checkedItemPositions.size(); i4++) {
            if (checkedItemPositions.valueAt(i4)) {
                iArr[i3] = checkedItemPositions.keyAt(i4);
                i3++;
            }
        }
        return iArr;
    }

    public final void d(int[] iArr) {
        if (this.c) {
            return;
        }
        this.b.onResult(iArr);
        this.c = true;
    }

    @Override // defpackage.G23
    public final void b() {
        try {
            this.a.show();
        } catch (WindowManager.BadTokenException unused) {
            d(null);
        }
    }

    @Override // defpackage.G23
    public final void a(boolean z) {
        AlertDialog alertDialog = this.a;
        if (z) {
            alertDialog.cancel();
            d(null);
        } else {
            this.c = true;
            alertDialog.cancel();
        }
    }
}
