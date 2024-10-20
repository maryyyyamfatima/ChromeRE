package org.chromium.content.browser.input;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.android.chrome.R;
import defpackage.C0062Am1;
import defpackage.C2245Rh0;
import defpackage.C2765Vh0;
import defpackage.C9142qm1;
import defpackage.DialogInterfaceOnClickListenerC9484rm1;
import defpackage.DialogInterfaceOnDismissListenerC9827sm1;
import defpackage.V60;
import java.util.Arrays;
import org.chromium.content.browser.picker.DateTimeSuggestion;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class DateTimeChooserAndroid {
    public long a;
    public final C0062Am1 b;

    public DateTimeChooserAndroid(Context context, long j) {
        this.a = j;
        this.b = new C0062Am1(context, new C2245Rh0(this));
    }

    public final void dismissAndDestroy() {
        this.a = 0L;
        this.b.a();
    }

    public static DateTimeSuggestion[] createSuggestionsArray(int i) {
        return new DateTimeSuggestion[i];
    }

    public static void setDateTimeSuggestionAt(DateTimeSuggestion[] dateTimeSuggestionArr, int i, double d, String str, String str2) {
        dateTimeSuggestionArr[i] = new DateTimeSuggestion(str, str2, d);
    }

    public static DateTimeChooserAndroid createDateTimeChooser(WindowAndroid windowAndroid, long j, int i, double d, double d2, double d3, double d4, DateTimeSuggestion[] dateTimeSuggestionArr) {
        Context context = (Context) windowAndroid.j.get();
        if (context == null || V60.a(context) == null) {
            return null;
        }
        DateTimeChooserAndroid dateTimeChooserAndroid = new DateTimeChooserAndroid(context, j);
        C0062Am1 c0062Am1 = dateTimeChooserAndroid.b;
        c0062Am1.a();
        if (dateTimeSuggestionArr != null) {
            Context context2 = c0062Am1.a;
            ListView listView = new ListView(context2);
            C2765Vh0 c2765Vh0 = new C2765Vh0(context2, Arrays.asList(dateTimeSuggestionArr));
            listView.setAdapter((ListAdapter) c2765Vh0);
            listView.setOnItemClickListener(new C9142qm1(c0062Am1, c2765Vh0, i, d, d2, d3, d4));
            AlertDialog create = new AlertDialog.Builder(context2).setTitle(i == 12 ? R.string.f89110_resource_name_obfuscated_res_0x7f140b33 : (i == 9 || i == 10) ? R.string.f71990_resource_name_obfuscated_res_0x7f1403e9 : i == 11 ? R.string.f77750_resource_name_obfuscated_res_0x7f140669 : i == 13 ? R.string.f91770_resource_name_obfuscated_res_0x7f140c56 : R.string.f71980_resource_name_obfuscated_res_0x7f1403e8).setView(listView).setNegativeButton(context2.getText(android.R.string.cancel), new DialogInterfaceOnClickListenerC9484rm1(c0062Am1)).create();
            c0062Am1.c = create;
            create.setOnDismissListener(new DialogInterfaceOnDismissListenerC9827sm1(c0062Am1));
            c0062Am1.b = false;
            c0062Am1.c.show();
            return dateTimeChooserAndroid;
        }
        c0062Am1.c(i, d, d2, d3, d4);
        return dateTimeChooserAndroid;
    }
}
