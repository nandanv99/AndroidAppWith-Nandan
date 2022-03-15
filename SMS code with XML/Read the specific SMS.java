<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#EAF2F3"
    tools:context=".MainActivity2">

    <TextView
        android:id="@+id/textView"
        android:layout_width="374dp"
        android:layout_height="143dp"
        android:gravity="center|center_horizontal"
        android:paddingLeft="20dp"
        android:paddingTop="20dp"
        android:paddingRight="20dp"
        android:textColor="#1B1919"
        android:textSize="26sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.486"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.448" />

    <Button
        android:id="@+id/button"
        android:layout_width="156dp"
        android:layout_height="68dp"
        android:layout_marginStart="152dp"
        android:layout_marginLeft="152dp"
        android:layout_marginTop="28dp"
        android:layout_marginEnd="153dp"
        android:layout_marginRight="153dp"
        android:layout_marginBottom="17dp"
        android:onClick="ReadSms"
        android:text="Share OTP"
        android:textSize="16sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.702" />
        
    <Button
        android:id="@+id/button2"
        android:layout_width="143dp"
        android:layout_height="58dp"
        android:onClick="net"
        android:text="Contact Us"
        android:textSize="14sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.878" />


</androidx.constraintlayout.widget.ConstraintLayout>