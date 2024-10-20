package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.TreeSet;
import org.chromium.components.crash.CrashKeys;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ha0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0911Ha0 {
    public static void a() {
        Context context = V60.a;
        CrashKeys crashKeys = CrashKeys.getInstance();
        TreeSet treeSet = new TreeSet();
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(AbstractC6547jD.a.c, 0).splitNames;
            if (strArr != null) {
                treeSet.addAll(Arrays.asList(strArr));
            }
            TreeSet treeSet2 = new TreeSet();
            if (AbstractC0689Fh3.a) {
                treeSet2.addAll(AbstractC2378Sh3.a(context).b());
                treeSet2.removeAll(treeSet);
            }
            crashKeys.set(3, treeSet.isEmpty() ? "<none>" : TextUtils.join(",", treeSet).replace('.', '$'));
            crashKeys.set(4, treeSet2.isEmpty() ? "<none>" : TextUtils.join(",", treeSet2).replace('.', '$'));
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
