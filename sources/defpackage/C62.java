package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class C62 {
    public final int a;

    public C62(NotificationChannel notificationChannel) {
        int importance;
        notificationChannel.getId();
        importance = notificationChannel.getImportance();
        Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.a = importance;
        AudioAttributes audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        notificationChannel.getName();
        notificationChannel.getDescription();
        notificationChannel.getGroup();
        notificationChannel.canShowBadge();
        notificationChannel.getSound();
        notificationChannel.getAudioAttributes();
        notificationChannel.shouldShowLights();
        notificationChannel.getLightColor();
        notificationChannel.shouldVibrate();
        notificationChannel.getVibrationPattern();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            notificationChannel.getParentChannelId();
            notificationChannel.getConversationId();
        }
        notificationChannel.canBypassDnd();
        notificationChannel.getLockscreenVisibility();
        if (i >= 29) {
            notificationChannel.canBubble();
        }
        if (i >= 30) {
            notificationChannel.isImportantConversation();
        }
    }
}
