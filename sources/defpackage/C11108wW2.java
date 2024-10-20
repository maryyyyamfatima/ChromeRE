package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.gcm.Task;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wW2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11108wW2 implements InterfaceC11451xW2 {
    public final Context a;
    public final PendingIntent b;

    public C11108wW2(Context context) {
        this.a = context;
        Intent intent = new Intent().setPackage("com.google.example.invalidpackage");
        int i = AbstractC4362cr2.a;
        this.b = PendingIntent.getBroadcast(context, 0, intent, 67108864);
    }

    @Override // defpackage.InterfaceC11451xW2
    public final boolean b(Task task) {
        Intent c = c("SCHEDULE_TASK");
        Bundle bundle = new Bundle();
        task.a(bundle);
        c.putExtras(bundle);
        this.a.sendBroadcast(c);
        return true;
    }

    @Override // defpackage.InterfaceC11451xW2
    public final boolean a(ComponentName componentName, String str) {
        Intent c = c("CANCEL_TASK");
        c.putExtra("component", componentName);
        c.putExtra("tag", str);
        this.a.sendBroadcast(c);
        return true;
    }

    public final Intent c(String str) {
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("app", this.b);
        intent.putExtra("source", 4);
        intent.putExtra("source_version", 222980000);
        intent.putExtra("scheduler_action", str);
        return intent;
    }
}
