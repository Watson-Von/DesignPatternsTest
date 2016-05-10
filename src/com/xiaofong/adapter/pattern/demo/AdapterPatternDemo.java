package com.xiaofong.adapter.pattern.demo;

/**
 * ������ģʽ��Adapter Pattern��:
 * ����Ϊ���������ݵĽӿ�֮����������������͵����ģʽ���ڽṹ��ģʽ������������������ӿڵĹ��ܡ�
 * 
 * ��Ҫ�����
 * ��Ҫ��������ϵͳ�У�����Ҫ��һЩ"�ִ�Ķ���"�ŵ��µĻ����У����»���Ҫ��Ľӿ����ֶ���������ġ�
 * 
 * �ŵ㣺 
 * 1���������κ�����û�й�������һ�����С� 
 * 2���������ĸ��á� 
 * 3�����������͸���ȡ�
 * 4������Ժá�
 * 
 * ȱ�㣺 
 * 1�������ʹ��������������ϵͳ�ǳ����ң�����������а��ա�
 * ���磬�����������õ��� A �ӿڣ���ʵ�ڲ���������� B �ӿڵ�ʵ�֣�
 * һ��ϵͳ���̫��������������������һ�����ѡ����������Ǻ��б�Ҫ��
 * ���Բ�ʹ��������������ֱ�Ӷ�ϵͳ�����ع��� 
 * 2.���� JAVA ����̳�һ���࣬��������ֻ������һ���������࣬����Ŀ��������ǳ����ࡣ 
 * @Author Watson_Von
 *
 */
public class AdapterPatternDemo {
	
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");
	}

}
